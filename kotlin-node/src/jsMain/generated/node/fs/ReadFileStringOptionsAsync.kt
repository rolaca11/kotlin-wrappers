// Generated by Karakum - do not modify it manually!

package node.fs

import js.promise.Promise
import node.events.Abortable


sealed external interface ReadFileStringAsyncOptions : Abortable {
var encoding: node.buffer.BufferEncoding
var flag: OpenMode?
}
