package klbase;
import io.grpc.*;
import grpc.*;

import java.util.HashMap;
import com.google.protobuf.ByteString;

import additionalclasses.Node;
import additionalclasses.Label;

public class EchoServer extends EchoServiceGrpc.EchoServiceImplBase {

    EchoServer() {
        NodeMap = new HashMap<Integer, Node>();
        LabelMap = new HashMap<Integer, Label>();
        globalNodeId = 0;
        globalLabelId = 0;
    }

    @Override
    public void echo(EchoRequest request, io.grpc.stub.StreamObserver<EchoResponse> responseObserver) {
        System.out.println("receive:"+request.getMessage());
        EchoResponse response = EchoResponse.newBuilder().setMessage("hello from server:"+request.getMessage()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new EchoServer()).build();
        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }

    @Override
    public void addNode(AddNodeRequest request, io.grpc.stub.StreamObserver<IdResponse> responseObserver) {
        NodeMap.put(globalNodeId, new Node(request.getHeadline(), request.getText()));

        System.out.println("New node " + request.getHeadline() + " " + request.getText());

        IdResponse response = IdResponse.newBuilder().setId(globalNodeId).build();
        globalNodeId++;
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addLabel(AddLabelRequest request, io.grpc.stub.StreamObserver<IdResponse> responseObserver) {
        LabelMap.put(globalLabelId, new Label(request.getText()));

        System.out.println("New label " + request.getText());

        IdResponse response = IdResponse.newBuilder().setId(globalLabelId).build();
        globalLabelId++;
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteLabel(IdRequest request, io.grpc.stub.StreamObserver<EmptyRequestResponse> responseObserver) {
        LabelMap.remove(request.getId());

        System.out.println("Delete label with id - " + request.getId());

        EmptyRequestResponse response = EmptyRequestResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void allLabels(EmptyRequestResponse request, io.grpc.stub.StreamObserver<GetAllLabelsResponse> responseObserver){
        GetAllLabelsResponse.Builder allLabel = GetAllLabelsResponse.newBuilder();
        LabelMap.forEach((k,v)->{
            allLabel.addText(v.GetText());
            allLabel.addId(k);
        });
        GetAllLabelsResponse response = allLabel.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void allNodes(EmptyRequestResponse request, io.grpc.stub.StreamObserver<GetAllNodesResponse> responseObserver){
        GetAllNodesResponse.Builder allNode = GetAllNodesResponse.newBuilder();
        NodeMap.forEach((k,v)->{
            allNode.addHeadline(v.GetHeadline());
            allNode.addText(v.GetText());
            allNode.addId(k);
        });
        GetAllNodesResponse response = allNode.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addLabelsToNode(SetLabelsToNodeRequest request, io.grpc.stub.StreamObserver<EmptyRequestResponse> responseObserver) {
        int labelsSize = request.getLabelsCount();
        for (int i = 0; i < labelsSize; ++i) {
            LabelMap.get(request.getLabels(i)).AddNode(request.getId());
        }

        EmptyRequestResponse response = EmptyRequestResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void serchNodeFromLabel(IdRequest request, io.grpc.stub.StreamObserver<GetAllLabelsResponse> responseObserver) {
        GetAllLabelsResponse.Builder allNode = GetAllLabelsResponse.newBuilder();
        int size = LabelMap.get(request.getId()).GetCount();
        int tmp[] = LabelMap.get(request.getId()).GetNodes();
        for (int i = 0; i < size; ++i) {
            allNode.addId(tmp[i]);
            allNode.addText(NodeMap.get(tmp[i]).GetHeadline());
        }
        GetAllLabelsResponse response = allNode.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addFileToNode(AddFileToNodeRequest request, io.grpc.stub.StreamObserver<EmptyRequestResponse> responseObserver) {
        NodeMap.get(request.getId()).SetFile(request.getName(), request.getData().toByteArray());

        EmptyRequestResponse response = EmptyRequestResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println("file get");
    }

    @Override
    public void getFileFromNode(GetFileFromNodeRequest request, io.grpc.stub.StreamObserver<GetFileResponse> responseObserver) {
        byte[] res = NodeMap.get(request.getId()).GetFile(request.getName());

        GetFileResponse response = GetFileResponse.newBuilder().setData(ByteString.copyFrom(res)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println("file send");
    }

    private HashMap<Integer, Node> NodeMap;
    private HashMap<Integer, Label> LabelMap;
    private int globalNodeId;
    private int globalLabelId;
}
