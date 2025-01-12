// Generated by Karakum - do not modify it manually!



package node.crypto




sealed external interface RSAKeyPairKeyObjectOptions {
/**
         * Key size in bits
         */
var modulusLength: Double
/**
         * Public exponent
         * @default 0x10001
         */
var publicExponent: Double?
}
