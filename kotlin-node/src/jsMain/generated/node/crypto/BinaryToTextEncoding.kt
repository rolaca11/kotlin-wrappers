// Generated by Karakum - do not modify it manually!



package node.crypto



// https://nodejs.org/api/buffer.html#buffer_buffers_and_character_encodings

@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{base64: 'base64', base64url: 'base64url', hex: 'hex', binary: 'binary'}/*union*/)""")
sealed external interface BinaryToTextEncoding {
companion object {
val base64: BinaryToTextEncoding
val base64url: BinaryToTextEncoding
val hex: BinaryToTextEncoding
val binary: BinaryToTextEncoding
}
}
