// Generated by Karakum - do not modify it manually!



package node.crypto




sealed external interface PublicKeyInput {
var key: Any /* string | Buffer */
var format: KeyFormat?
var type: PublicKeyInputType?
var encoding: String?
}
