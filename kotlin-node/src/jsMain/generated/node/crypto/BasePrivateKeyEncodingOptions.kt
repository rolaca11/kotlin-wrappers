// Generated by Karakum - do not modify it manually!



package node.crypto




sealed external interface BasePrivateKeyEncodingOptions<T : KeyFormat> {
var format: T
var cipher: String?
var passphrase: String?
}
