/* DO NOT EDIT THIS FILE - it is machine generated */
#include <native.h>

#ifndef _Included_gnu_java_net_PlainSocketImpl
#define _Included_gnu_java_net_PlainSocketImpl

#ifdef __cplusplus
extern "C" {
#endif

/* Header for class gnu_java_net_PlainSocketImpl */

typedef struct Hgnu_java_net_PlainSocketImpl {
  /* Fields from java/lang/Object: */
  Hjava_lang_Object base;

  /* Fields from java/net/SocketImpl: */
  struct Hjava_net_InetAddress* address;
  struct Hjava_io_FileDescriptor* fd;
  jint localport;
  jint port;

  /* Fields from gnu/java/net/PlainSocketImpl: */
  struct Hjava_io_InputStream* in;
  struct Hjava_io_OutputStream* out;
  jint timeout;
  jboolean closed;
  jboolean blocking;
  jboolean connecting;
  jint native_fd;
  jboolean inChannelOperation;
} Hgnu_java_net_PlainSocketImpl;

extern void gnu_java_net_PlainSocketImpl_socketSetOption(struct Hgnu_java_net_PlainSocketImpl*, jint, struct Hjava_lang_Object*);
extern jint gnu_java_net_PlainSocketImpl_socketGetOption(struct Hgnu_java_net_PlainSocketImpl*, jint);
extern void gnu_java_net_PlainSocketImpl_socketAccept(struct Hgnu_java_net_PlainSocketImpl*, struct Hjava_net_SocketImpl*);
extern jint gnu_java_net_PlainSocketImpl_socketAvailable(struct Hgnu_java_net_PlainSocketImpl*);
extern void gnu_java_net_PlainSocketImpl_socketBind(struct Hgnu_java_net_PlainSocketImpl*, struct Hjava_net_InetAddress*, jint);
extern void gnu_java_net_PlainSocketImpl_socketClose(struct Hgnu_java_net_PlainSocketImpl*);
extern void gnu_java_net_PlainSocketImpl_socketConnect(struct Hgnu_java_net_PlainSocketImpl*, struct Hjava_net_InetAddress*, jint, jint);
extern void gnu_java_net_PlainSocketImpl_socketCreate(struct Hgnu_java_net_PlainSocketImpl*, jboolean);
extern void gnu_java_net_PlainSocketImpl_socketListen(struct Hgnu_java_net_PlainSocketImpl*, jint);
extern jint gnu_java_net_PlainSocketImpl_socketRead(struct Hgnu_java_net_PlainSocketImpl*, HArrayOfByte*, jint, jint);
extern void gnu_java_net_PlainSocketImpl_socketWrite(struct Hgnu_java_net_PlainSocketImpl*, HArrayOfByte*, jint, jint);
extern void gnu_java_net_PlainSocketImpl_waitForConnection(struct Hgnu_java_net_PlainSocketImpl*);
extern void gnu_java_net_PlainSocketImpl_setBlocking(struct Hgnu_java_net_PlainSocketImpl*, jboolean);

#ifdef __cplusplus
}
#endif

#endif
