// Generated by Karakum - do not modify it manually!



package node.crypto




@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{secret: 'secret', public: 'public', private: 'private'}/*union*/)""")
sealed external interface KeyObjectType {
companion object {
val secret: KeyObjectType
val public: KeyObjectType
val private: KeyObjectType
}
}
