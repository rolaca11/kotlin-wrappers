// Generated by Karakum - do not modify it manually!



package node.fs

import js.promise.Promise


sealed external interface FileChangeInfo<T : Any /* string | Buffer */> {
var eventType: WatchEventType
var filename: T
}
