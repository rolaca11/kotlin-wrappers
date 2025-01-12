// Generated by Karakum - do not modify it manually!



package node.crypto




sealed external interface RSAPSSKeyPairKeyObjectOptions {
/**
         * Key size in bits
         */
var modulusLength: Double
/**
         * Public exponent
         * @default 0x10001
         */
var publicExponent: Double?
/**
         * Name of the message digest
         */
var hashAlgorithm: String?
/**
         * Name of the message digest used by MGF1
         */
var mgf1HashAlgorithm: String?
/**
         * Minimal salt length in bytes
         */
var saltLength: String?
}
