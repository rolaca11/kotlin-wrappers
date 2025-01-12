// Generated by Karakum - do not modify it manually!



package node.crypto




sealed external interface RSAKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
/**
         * Key size in bits
         */
var modulusLength: Double
/**
         * Public exponent
         * @default 0x10001
         */
var publicExponent: Double?
var publicKeyEncoding: RSAKeyPairOptionsPublicKeyEncoding<PubF>
var privateKeyEncoding: RSAKeyPairOptionsPrivateKeyEncoding<PrivF>
}
