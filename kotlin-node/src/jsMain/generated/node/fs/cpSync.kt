// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs

import node.url.URL

/**
     * Synchronously copies the entire directory structure from `src` to `dest`,
     * including subdirectories and files.
     *
     * When copying a directory to another directory, globs are not supported and
     * behavior is similar to `cp dir1/ dir2/`.
     * @since v16.7.0
     * @experimental
     * @param src source path to copy.
     * @param dest destination path to copy to.
     */
external fun cpSync(source: String, destination: String, opts: CopySyncOptions = definedExternally): Unit

external fun cpSync(source: String, destination: URL, opts: CopySyncOptions = definedExternally): Unit

external fun cpSync(source: URL, destination: String, opts: CopySyncOptions = definedExternally): Unit

external fun cpSync(source: URL, destination: URL, opts: CopySyncOptions = definedExternally): Unit
