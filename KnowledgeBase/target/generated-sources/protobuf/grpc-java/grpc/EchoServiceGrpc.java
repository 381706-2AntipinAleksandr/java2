package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: hello.proto")
public final class EchoServiceGrpc {

  private EchoServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.EchoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.AddNodeRequest,
      grpc.IdResponse> getAddNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNode",
      requestType = grpc.AddNodeRequest.class,
      responseType = grpc.IdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.AddNodeRequest,
      grpc.IdResponse> getAddNodeMethod() {
    io.grpc.MethodDescriptor<grpc.AddNodeRequest, grpc.IdResponse> getAddNodeMethod;
    if ((getAddNodeMethod = EchoServiceGrpc.getAddNodeMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getAddNodeMethod = EchoServiceGrpc.getAddNodeMethod) == null) {
          EchoServiceGrpc.getAddNodeMethod = getAddNodeMethod =
              io.grpc.MethodDescriptor.<grpc.AddNodeRequest, grpc.IdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.AddNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.IdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("addNode"))
              .build();
        }
      }
    }
    return getAddNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.AddLabelRequest,
      grpc.IdResponse> getAddLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addLabel",
      requestType = grpc.AddLabelRequest.class,
      responseType = grpc.IdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.AddLabelRequest,
      grpc.IdResponse> getAddLabelMethod() {
    io.grpc.MethodDescriptor<grpc.AddLabelRequest, grpc.IdResponse> getAddLabelMethod;
    if ((getAddLabelMethod = EchoServiceGrpc.getAddLabelMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getAddLabelMethod = EchoServiceGrpc.getAddLabelMethod) == null) {
          EchoServiceGrpc.getAddLabelMethod = getAddLabelMethod =
              io.grpc.MethodDescriptor.<grpc.AddLabelRequest, grpc.IdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.AddLabelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.IdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("addLabel"))
              .build();
        }
      }
    }
    return getAddLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.IdRequest,
      grpc.EmptyRequestResponse> getDeleteLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLabel",
      requestType = grpc.IdRequest.class,
      responseType = grpc.EmptyRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.IdRequest,
      grpc.EmptyRequestResponse> getDeleteLabelMethod() {
    io.grpc.MethodDescriptor<grpc.IdRequest, grpc.EmptyRequestResponse> getDeleteLabelMethod;
    if ((getDeleteLabelMethod = EchoServiceGrpc.getDeleteLabelMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getDeleteLabelMethod = EchoServiceGrpc.getDeleteLabelMethod) == null) {
          EchoServiceGrpc.getDeleteLabelMethod = getDeleteLabelMethod =
              io.grpc.MethodDescriptor.<grpc.IdRequest, grpc.EmptyRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EmptyRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("deleteLabel"))
              .build();
        }
      }
    }
    return getDeleteLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.EmptyRequestResponse,
      grpc.GetAllLabelsResponse> getAllLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allLabels",
      requestType = grpc.EmptyRequestResponse.class,
      responseType = grpc.GetAllLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.EmptyRequestResponse,
      grpc.GetAllLabelsResponse> getAllLabelsMethod() {
    io.grpc.MethodDescriptor<grpc.EmptyRequestResponse, grpc.GetAllLabelsResponse> getAllLabelsMethod;
    if ((getAllLabelsMethod = EchoServiceGrpc.getAllLabelsMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getAllLabelsMethod = EchoServiceGrpc.getAllLabelsMethod) == null) {
          EchoServiceGrpc.getAllLabelsMethod = getAllLabelsMethod =
              io.grpc.MethodDescriptor.<grpc.EmptyRequestResponse, grpc.GetAllLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "allLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EmptyRequestResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.GetAllLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("allLabels"))
              .build();
        }
      }
    }
    return getAllLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.EmptyRequestResponse,
      grpc.GetAllNodesResponse> getAllNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allNodes",
      requestType = grpc.EmptyRequestResponse.class,
      responseType = grpc.GetAllNodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.EmptyRequestResponse,
      grpc.GetAllNodesResponse> getAllNodesMethod() {
    io.grpc.MethodDescriptor<grpc.EmptyRequestResponse, grpc.GetAllNodesResponse> getAllNodesMethod;
    if ((getAllNodesMethod = EchoServiceGrpc.getAllNodesMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getAllNodesMethod = EchoServiceGrpc.getAllNodesMethod) == null) {
          EchoServiceGrpc.getAllNodesMethod = getAllNodesMethod =
              io.grpc.MethodDescriptor.<grpc.EmptyRequestResponse, grpc.GetAllNodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "allNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EmptyRequestResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.GetAllNodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("allNodes"))
              .build();
        }
      }
    }
    return getAllNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.SetLabelsToNodeRequest,
      grpc.EmptyRequestResponse> getAddLabelsToNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addLabelsToNode",
      requestType = grpc.SetLabelsToNodeRequest.class,
      responseType = grpc.EmptyRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.SetLabelsToNodeRequest,
      grpc.EmptyRequestResponse> getAddLabelsToNodeMethod() {
    io.grpc.MethodDescriptor<grpc.SetLabelsToNodeRequest, grpc.EmptyRequestResponse> getAddLabelsToNodeMethod;
    if ((getAddLabelsToNodeMethod = EchoServiceGrpc.getAddLabelsToNodeMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getAddLabelsToNodeMethod = EchoServiceGrpc.getAddLabelsToNodeMethod) == null) {
          EchoServiceGrpc.getAddLabelsToNodeMethod = getAddLabelsToNodeMethod =
              io.grpc.MethodDescriptor.<grpc.SetLabelsToNodeRequest, grpc.EmptyRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addLabelsToNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.SetLabelsToNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EmptyRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("addLabelsToNode"))
              .build();
        }
      }
    }
    return getAddLabelsToNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.IdRequest,
      grpc.GetAllLabelsResponse> getSerchNodeFromLabelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serchNodeFromLabel",
      requestType = grpc.IdRequest.class,
      responseType = grpc.GetAllLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.IdRequest,
      grpc.GetAllLabelsResponse> getSerchNodeFromLabelMethod() {
    io.grpc.MethodDescriptor<grpc.IdRequest, grpc.GetAllLabelsResponse> getSerchNodeFromLabelMethod;
    if ((getSerchNodeFromLabelMethod = EchoServiceGrpc.getSerchNodeFromLabelMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getSerchNodeFromLabelMethod = EchoServiceGrpc.getSerchNodeFromLabelMethod) == null) {
          EchoServiceGrpc.getSerchNodeFromLabelMethod = getSerchNodeFromLabelMethod =
              io.grpc.MethodDescriptor.<grpc.IdRequest, grpc.GetAllLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serchNodeFromLabel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.IdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.GetAllLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("serchNodeFromLabel"))
              .build();
        }
      }
    }
    return getSerchNodeFromLabelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.AddFileToNodeRequest,
      grpc.EmptyRequestResponse> getAddFileToNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addFileToNode",
      requestType = grpc.AddFileToNodeRequest.class,
      responseType = grpc.EmptyRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.AddFileToNodeRequest,
      grpc.EmptyRequestResponse> getAddFileToNodeMethod() {
    io.grpc.MethodDescriptor<grpc.AddFileToNodeRequest, grpc.EmptyRequestResponse> getAddFileToNodeMethod;
    if ((getAddFileToNodeMethod = EchoServiceGrpc.getAddFileToNodeMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getAddFileToNodeMethod = EchoServiceGrpc.getAddFileToNodeMethod) == null) {
          EchoServiceGrpc.getAddFileToNodeMethod = getAddFileToNodeMethod =
              io.grpc.MethodDescriptor.<grpc.AddFileToNodeRequest, grpc.EmptyRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addFileToNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.AddFileToNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EmptyRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("addFileToNode"))
              .build();
        }
      }
    }
    return getAddFileToNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.GetFileFromNodeRequest,
      grpc.GetFileResponse> getGetFileFromNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFileFromNode",
      requestType = grpc.GetFileFromNodeRequest.class,
      responseType = grpc.GetFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.GetFileFromNodeRequest,
      grpc.GetFileResponse> getGetFileFromNodeMethod() {
    io.grpc.MethodDescriptor<grpc.GetFileFromNodeRequest, grpc.GetFileResponse> getGetFileFromNodeMethod;
    if ((getGetFileFromNodeMethod = EchoServiceGrpc.getGetFileFromNodeMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getGetFileFromNodeMethod = EchoServiceGrpc.getGetFileFromNodeMethod) == null) {
          EchoServiceGrpc.getGetFileFromNodeMethod = getGetFileFromNodeMethod =
              io.grpc.MethodDescriptor.<grpc.GetFileFromNodeRequest, grpc.GetFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFileFromNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.GetFileFromNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.GetFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("getFileFromNode"))
              .build();
        }
      }
    }
    return getGetFileFromNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.EchoRequest,
      grpc.EchoResponse> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "echo",
      requestType = grpc.EchoRequest.class,
      responseType = grpc.EchoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.EchoRequest,
      grpc.EchoResponse> getEchoMethod() {
    io.grpc.MethodDescriptor<grpc.EchoRequest, grpc.EchoResponse> getEchoMethod;
    if ((getEchoMethod = EchoServiceGrpc.getEchoMethod) == null) {
      synchronized (EchoServiceGrpc.class) {
        if ((getEchoMethod = EchoServiceGrpc.getEchoMethod) == null) {
          EchoServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<grpc.EchoRequest, grpc.EchoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EchoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.EchoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EchoServiceMethodDescriptorSupplier("echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceStub>() {
        @java.lang.Override
        public EchoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceStub(channel, callOptions);
        }
      };
    return EchoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceBlockingStub>() {
        @java.lang.Override
        public EchoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceBlockingStub(channel, callOptions);
        }
      };
    return EchoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EchoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EchoServiceFutureStub>() {
        @java.lang.Override
        public EchoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EchoServiceFutureStub(channel, callOptions);
        }
      };
    return EchoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EchoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addNode(grpc.AddNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.IdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddNodeMethod(), responseObserver);
    }

    /**
     */
    public void addLabel(grpc.AddLabelRequest request,
        io.grpc.stub.StreamObserver<grpc.IdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLabelMethod(), responseObserver);
    }

    /**
     */
    public void deleteLabel(grpc.IdRequest request,
        io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLabelMethod(), responseObserver);
    }

    /**
     */
    public void allLabels(grpc.EmptyRequestResponse request,
        io.grpc.stub.StreamObserver<grpc.GetAllLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllLabelsMethod(), responseObserver);
    }

    /**
     */
    public void allNodes(grpc.EmptyRequestResponse request,
        io.grpc.stub.StreamObserver<grpc.GetAllNodesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllNodesMethod(), responseObserver);
    }

    /**
     */
    public void addLabelsToNode(grpc.SetLabelsToNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLabelsToNodeMethod(), responseObserver);
    }

    /**
     */
    public void serchNodeFromLabel(grpc.IdRequest request,
        io.grpc.stub.StreamObserver<grpc.GetAllLabelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSerchNodeFromLabelMethod(), responseObserver);
    }

    /**
     */
    public void addFileToNode(grpc.AddFileToNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFileToNodeMethod(), responseObserver);
    }

    /**
     */
    public void getFileFromNode(grpc.GetFileFromNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.GetFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileFromNodeMethod(), responseObserver);
    }

    /**
     */
    public void echo(grpc.EchoRequest request,
        io.grpc.stub.StreamObserver<grpc.EchoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.AddNodeRequest,
                grpc.IdResponse>(
                  this, METHODID_ADD_NODE)))
          .addMethod(
            getAddLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.AddLabelRequest,
                grpc.IdResponse>(
                  this, METHODID_ADD_LABEL)))
          .addMethod(
            getDeleteLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.IdRequest,
                grpc.EmptyRequestResponse>(
                  this, METHODID_DELETE_LABEL)))
          .addMethod(
            getAllLabelsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.EmptyRequestResponse,
                grpc.GetAllLabelsResponse>(
                  this, METHODID_ALL_LABELS)))
          .addMethod(
            getAllNodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.EmptyRequestResponse,
                grpc.GetAllNodesResponse>(
                  this, METHODID_ALL_NODES)))
          .addMethod(
            getAddLabelsToNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.SetLabelsToNodeRequest,
                grpc.EmptyRequestResponse>(
                  this, METHODID_ADD_LABELS_TO_NODE)))
          .addMethod(
            getSerchNodeFromLabelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.IdRequest,
                grpc.GetAllLabelsResponse>(
                  this, METHODID_SERCH_NODE_FROM_LABEL)))
          .addMethod(
            getAddFileToNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.AddFileToNodeRequest,
                grpc.EmptyRequestResponse>(
                  this, METHODID_ADD_FILE_TO_NODE)))
          .addMethod(
            getGetFileFromNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.GetFileFromNodeRequest,
                grpc.GetFileResponse>(
                  this, METHODID_GET_FILE_FROM_NODE)))
          .addMethod(
            getEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.EchoRequest,
                grpc.EchoResponse>(
                  this, METHODID_ECHO)))
          .build();
    }
  }

  /**
   */
  public static final class EchoServiceStub extends io.grpc.stub.AbstractAsyncStub<EchoServiceStub> {
    private EchoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceStub(channel, callOptions);
    }

    /**
     */
    public void addNode(grpc.AddNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.IdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLabel(grpc.AddLabelRequest request,
        io.grpc.stub.StreamObserver<grpc.IdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLabel(grpc.IdRequest request,
        io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allLabels(grpc.EmptyRequestResponse request,
        io.grpc.stub.StreamObserver<grpc.GetAllLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allNodes(grpc.EmptyRequestResponse request,
        io.grpc.stub.StreamObserver<grpc.GetAllNodesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLabelsToNode(grpc.SetLabelsToNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLabelsToNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serchNodeFromLabel(grpc.IdRequest request,
        io.grpc.stub.StreamObserver<grpc.GetAllLabelsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerchNodeFromLabelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addFileToNode(grpc.AddFileToNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFileToNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileFromNode(grpc.GetFileFromNodeRequest request,
        io.grpc.stub.StreamObserver<grpc.GetFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileFromNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echo(grpc.EchoRequest request,
        io.grpc.stub.StreamObserver<grpc.EchoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EchoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EchoServiceBlockingStub> {
    private EchoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.IdResponse addNode(grpc.AddNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.IdResponse addLabel(grpc.AddLabelRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLabelMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.EmptyRequestResponse deleteLabel(grpc.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLabelMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.GetAllLabelsResponse allLabels(grpc.EmptyRequestResponse request) {
      return blockingUnaryCall(
          getChannel(), getAllLabelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.GetAllNodesResponse allNodes(grpc.EmptyRequestResponse request) {
      return blockingUnaryCall(
          getChannel(), getAllNodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.EmptyRequestResponse addLabelsToNode(grpc.SetLabelsToNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddLabelsToNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.GetAllLabelsResponse serchNodeFromLabel(grpc.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSerchNodeFromLabelMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.EmptyRequestResponse addFileToNode(grpc.AddFileToNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddFileToNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.GetFileResponse getFileFromNode(grpc.GetFileFromNodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFileFromNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.EchoResponse echo(grpc.EchoRequest request) {
      return blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EchoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EchoServiceFutureStub> {
    private EchoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EchoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.IdResponse> addNode(
        grpc.AddNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.IdResponse> addLabel(
        grpc.AddLabelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLabelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.EmptyRequestResponse> deleteLabel(
        grpc.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLabelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.GetAllLabelsResponse> allLabels(
        grpc.EmptyRequestResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getAllLabelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.GetAllNodesResponse> allNodes(
        grpc.EmptyRequestResponse request) {
      return futureUnaryCall(
          getChannel().newCall(getAllNodesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.EmptyRequestResponse> addLabelsToNode(
        grpc.SetLabelsToNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLabelsToNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.GetAllLabelsResponse> serchNodeFromLabel(
        grpc.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSerchNodeFromLabelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.EmptyRequestResponse> addFileToNode(
        grpc.AddFileToNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFileToNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.GetFileResponse> getFileFromNode(
        grpc.GetFileFromNodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileFromNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.EchoResponse> echo(
        grpc.EchoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_NODE = 0;
  private static final int METHODID_ADD_LABEL = 1;
  private static final int METHODID_DELETE_LABEL = 2;
  private static final int METHODID_ALL_LABELS = 3;
  private static final int METHODID_ALL_NODES = 4;
  private static final int METHODID_ADD_LABELS_TO_NODE = 5;
  private static final int METHODID_SERCH_NODE_FROM_LABEL = 6;
  private static final int METHODID_ADD_FILE_TO_NODE = 7;
  private static final int METHODID_GET_FILE_FROM_NODE = 8;
  private static final int METHODID_ECHO = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EchoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_NODE:
          serviceImpl.addNode((grpc.AddNodeRequest) request,
              (io.grpc.stub.StreamObserver<grpc.IdResponse>) responseObserver);
          break;
        case METHODID_ADD_LABEL:
          serviceImpl.addLabel((grpc.AddLabelRequest) request,
              (io.grpc.stub.StreamObserver<grpc.IdResponse>) responseObserver);
          break;
        case METHODID_DELETE_LABEL:
          serviceImpl.deleteLabel((grpc.IdRequest) request,
              (io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse>) responseObserver);
          break;
        case METHODID_ALL_LABELS:
          serviceImpl.allLabels((grpc.EmptyRequestResponse) request,
              (io.grpc.stub.StreamObserver<grpc.GetAllLabelsResponse>) responseObserver);
          break;
        case METHODID_ALL_NODES:
          serviceImpl.allNodes((grpc.EmptyRequestResponse) request,
              (io.grpc.stub.StreamObserver<grpc.GetAllNodesResponse>) responseObserver);
          break;
        case METHODID_ADD_LABELS_TO_NODE:
          serviceImpl.addLabelsToNode((grpc.SetLabelsToNodeRequest) request,
              (io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse>) responseObserver);
          break;
        case METHODID_SERCH_NODE_FROM_LABEL:
          serviceImpl.serchNodeFromLabel((grpc.IdRequest) request,
              (io.grpc.stub.StreamObserver<grpc.GetAllLabelsResponse>) responseObserver);
          break;
        case METHODID_ADD_FILE_TO_NODE:
          serviceImpl.addFileToNode((grpc.AddFileToNodeRequest) request,
              (io.grpc.stub.StreamObserver<grpc.EmptyRequestResponse>) responseObserver);
          break;
        case METHODID_GET_FILE_FROM_NODE:
          serviceImpl.getFileFromNode((grpc.GetFileFromNodeRequest) request,
              (io.grpc.stub.StreamObserver<grpc.GetFileResponse>) responseObserver);
          break;
        case METHODID_ECHO:
          serviceImpl.echo((grpc.EchoRequest) request,
              (io.grpc.stub.StreamObserver<grpc.EchoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EchoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.EchoServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EchoService");
    }
  }

  private static final class EchoServiceFileDescriptorSupplier
      extends EchoServiceBaseDescriptorSupplier {
    EchoServiceFileDescriptorSupplier() {}
  }

  private static final class EchoServiceMethodDescriptorSupplier
      extends EchoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EchoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoServiceFileDescriptorSupplier())
              .addMethod(getAddNodeMethod())
              .addMethod(getAddLabelMethod())
              .addMethod(getDeleteLabelMethod())
              .addMethod(getAllLabelsMethod())
              .addMethod(getAllNodesMethod())
              .addMethod(getAddLabelsToNodeMethod())
              .addMethod(getSerchNodeFromLabelMethod())
              .addMethod(getAddFileToNodeMethod())
              .addMethod(getGetFileFromNodeMethod())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
