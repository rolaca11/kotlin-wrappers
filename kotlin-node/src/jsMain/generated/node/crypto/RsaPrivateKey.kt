// Generated by Karakum - do not modify it manually!



package node.crypto




sealed external interface RsaPrivateKey {
var key: KeyLike
var passphrase: String?
/**
         * @default 'sha1'
         */
var oaepHash: String?
var oaepLabel: js.typedarrays.TypedArray<*, *>?
var padding: Double?
}
