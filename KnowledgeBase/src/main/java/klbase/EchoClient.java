package klbase;
import grpc.*;
import io.grpc.*;
import java.io.FileReader;
import java.util.Scanner;

import com.google.protobuf.ByteString;

public class EchoClient {
    public static void main(String[] args) {
        EchoServiceGrpc.EchoServiceBlockingStub client = createClient("localhost",8080);
        System.out.println("Connected to server");
        Scanner console = new Scanner(System.in);
        String message;
        while(true) {
            System.out.print("command>> ");
            if((message = console.nextLine()) == null)
                break;
            if (message.equals("addNode"))
                AddNode(client, console);
            else if (message.equals("addLabel"))
                AddLabel(client, console);
            else if (message.equals("deleteLabel"))
                DeleteLabel(client, console);
            else if (message.equals("allLabels"))
                AllLabels(client);
            else if (message.equals("allNodes"))
                AllNodes(client);
            else if (message.equals("addLabelsToNode"))
                AddLabelsToNode(client, console);
            else if (message.equals("serchNodeFromLabel"))
                SerchNodeFromLabel(client, console);
            else if (message.equals("addFileToNode"))
                AddFileToNode(client, console);
            else if (message.equals("getFileFromNode"))
                GetFileFromNode(client, console);
            else
                System.out.println("Wrong command T_T, try again");
        }
        console.close();
    }

    private static EchoServiceGrpc.EchoServiceBlockingStub createClient(String host, int port){
        Channel channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext()
                .build();
        return EchoServiceGrpc.newBlockingStub(channel);
    }

    private static int AddNode(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.print("Write headline of Node: ");
        String headline = console.nextLine();
        System.out.println("Write text of Node:");
        String text = console.nextLine();
        AddNodeRequest request = AddNodeRequest.newBuilder().setHeadline(headline).setText(text).build();
        IdResponse response = client.addNode(request);
        System.out.println("Node added to knowledgebase, node id - " + response.getId());
        return response.getId();
    }

    private static int AddLabel(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.print("Write text of Label: ");
        String text = console.nextLine();
        AddLabelRequest request = AddLabelRequest.newBuilder().setText(text).build();
        IdResponse response = client.addLabel(request);
        System.out.println("Label added to knowledgebase, node id - " + response.getId());
        return response.getId();
    }

    private static void DeleteLabel(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.print("Write label id: ");
        String text = console.nextLine();
        IdRequest request = IdRequest.newBuilder().setId(Integer.parseInt(text)).build();
        client.deleteLabel(request);
        System.out.println("Label " + text + " deleted from knowledgebase");
    }

    private static void AllLabels(EchoServiceGrpc.EchoServiceBlockingStub client) {
        EmptyRequestResponse request = EmptyRequestResponse.newBuilder().build();
        GetAllLabelsResponse response = client.allLabels(request);
        int size = response.getIdCount();
        for (int i = 0; i < size; ++i) {
            System.out.println(response.getId(i) + ": " + response.getText(i));
        }
    }

    private static void AllNodes(EchoServiceGrpc.EchoServiceBlockingStub client) {
        EmptyRequestResponse request = EmptyRequestResponse.newBuilder().build();
        GetAllNodesResponse response = client.allNodes(request);
        int size = response.getIdCount();
        for (int i = 0; i < size; ++i) {
            System.out.println(response.getId(i) + ": " + response.getHeadline(i) + ": " + response.getText(i));
        }
    }

    private static void AddLabelsToNode(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.print("Write Node id: ");
        int id = Integer.parseInt(console.nextLine());
        System.out.print("Write Label ids: ");
        String label = console.nextLine();
        String labels[] = label.trim().split(" ");
        int labelsIds[] = new int[labels.length];
        for (int i = 0; i < labelsIds.length; ++i)
            labelsIds[i] = Integer.parseInt(labels[i]);
        SetLabelsToNodeRequest.Builder builder = SetLabelsToNodeRequest.newBuilder().setId(id);
        for (int i = 0; i < labelsIds.length; ++i)
            builder.addLabels(labelsIds[i]);
        SetLabelsToNodeRequest request = builder.build();
        client.addLabelsToNode(request);
        System.out.println("Labels added");
    }

    private static void SerchNodeFromLabel(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.println("Write label id");
        int id = Integer.parseInt(console.nextLine());
        IdRequest request = IdRequest.newBuilder().setId(id).build();
        GetAllLabelsResponse response = client.serchNodeFromLabel(request);
        int size = response.getIdCount();
        for (int i = 0; i < size; ++i) {
            System.out.println(response.getId(i) + ": " + response.getText(i));
        }
    }

    private static void AddFileToNode(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.print("Write node id: ");
        int id = Integer.parseInt(console.nextLine());
        System.out.print("Write file name: ");
        String name = console.nextLine();
        System.out.println("Write path to file:");
        String path = console.nextLine();
        try {
            FileReader fr = new FileReader(path);
            Scanner scan = new Scanner(fr);

            String fileData = null;
            int i = 1;
            while (scan.hasNextLine()) {
                fileData += scan.nextLine();
                i++;
            }
            fr.close();

            byte srcData[] = fileData.getBytes();

            AddFileToNodeRequest request = AddFileToNodeRequest.newBuilder().setId(id).setName(name).setData(ByteString.copyFrom(srcData)).build();
            client.addFileToNode(request);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void GetFileFromNode(EchoServiceGrpc.EchoServiceBlockingStub client, Scanner console) {
        System.out.print("Write node id: ");
        int id = Integer.parseInt(console.nextLine());
        System.out.print("Write file name: ");
        String name = console.nextLine();
        GetFileFromNodeRequest request = GetFileFromNodeRequest.newBuilder().setId(id).setName(name).build();
        GetFileResponse response = client.getFileFromNode(request);
        String file = response.getData().toString();
        System.out.println(file);
    }
}
