// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs



/**
     * Creates a unique temporary directory.
     *
     * Generates six random characters to be appended behind a required`prefix` to create a unique temporary directory. Due to platform
     * inconsistencies, avoid trailing `X` characters in `prefix`. Some platforms,
     * notably the BSDs, can return more than six random characters, and replace
     * trailing `X` characters in `prefix` with random characters.
     *
     * The created directory path is passed as a string to the callback's second
     * parameter.
     *
     * The optional `options` argument can be a string specifying an encoding, or an
     * object with an `encoding` property specifying the character encoding to use.
     *
     * ```js
     * import { mkdtemp } from 'fs';
     *
     * mkdtemp(path.join(os.tmpdir(), 'foo-'), (err, directory) => {
     *   if (err) throw err;
     *   console.log(directory);
     *   // Prints: /tmp/foo-itXde2 or C:\Users\...\AppData\Local\Temp\foo-itXde2
     * });
     * ```
     *
     * The `fs.mkdtemp()` method will append the six randomly selected characters
     * directly to the `prefix` string. For instance, given a directory `/tmp`, if the
     * intention is to create a temporary directory _within_`/tmp`, the `prefix`must end with a trailing platform-specific path separator
     * (`require('path').sep`).
     *
     * ```js
     * import { tmpdir } from 'os';
     * import { mkdtemp } from 'fs';
     *
     * // The parent directory for the new temporary directory
     * const tmpDir = tmpdir();
     *
     * // This method is *INCORRECT*:
     * mkdtemp(tmpDir, (err, directory) => {
     *   if (err) throw err;
     *   console.log(directory);
     *   // Will print something similar to `/tmpabc123`.
     *   // A new temporary directory is created at the file system root
     *   // rather than *within* the /tmp directory.
     * });
     *
     * // This method is *CORRECT*:
     * import { sep } from 'path';
     * mkdtemp(`${tmpDir}${sep}`, (err, directory) => {
     *   if (err) throw err;
     *   console.log(directory);
     *   // Will print something similar to `/tmp/abc123`.
     *   // A new temporary directory is created within
     *   // the /tmp directory.
     * });
     * ```
     * @since v5.10.0
     */
external fun mkdtemp(prefix: String, options: EncodingOption, callback: (err: node.ErrnoException?, folder: String) -> Unit): Unit

/**
     * Asynchronously creates a unique temporary directory.
     * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
     * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
     */
external fun mkdtemp(prefix: String, options: String /* 'buffer' */, callback: (err: node.ErrnoException?, folder: node.buffer.Buffer) -> Unit): Unit

external fun mkdtemp(prefix: String, options: MkdtempOptions, callback: (err: node.ErrnoException?, folder: node.buffer.Buffer) -> Unit): Unit

/**
     * Asynchronously creates a unique temporary directory.
     * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
     * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
     */
external fun mkdtemp(prefix: String, options: EncodingOption, callback: (err: node.ErrnoException?, folder: Any /* string | Buffer */) -> Unit): Unit

/**
     * Asynchronously creates a unique temporary directory.
     * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
     */
external fun mkdtemp(prefix: String, callback: (err: node.ErrnoException?, folder: String) -> Unit): Unit
