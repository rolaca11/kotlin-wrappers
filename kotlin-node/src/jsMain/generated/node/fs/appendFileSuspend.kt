// Generated by Karakum - do not modify it manually!

package node.fs

import js.promise.await
import js.typedarrays.Uint8Array


suspend fun appendFile(path: PathLike, data: String, options: (AppendFileAsyncOptions)? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: PathLike, data: String, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: PathLike, data: Uint8Array, options: (AppendFileAsyncOptions)? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: PathLike, data: Uint8Array, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: FileHandle, data: String, options: (AppendFileAsyncOptions)? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: FileHandle, data: String, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: FileHandle, data: Uint8Array, options: (AppendFileAsyncOptions)? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
                    


suspend fun appendFile(path: FileHandle, data: Uint8Array, options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>()): Unit =
    appendFileAsync(
        path, data, options
    ).await()
