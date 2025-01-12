// Generated by Karakum - do not modify it manually!



package bodyparser

import connect.NextHandleFunction


external interface BodyParser {
/**
         * @deprecated  use individual json/urlencoded middlewares
         */

@Suppress("DEPRECATION")
@nativeInvoke
operator fun  invoke(options: BodyParserOptions = definedExternally): NextHandleFunction
            
/**
         * Returns middleware that only parses json and only looks at requests
         * where the Content-Type header matches the type option.
         */
fun json(options: OptionsJson = definedExternally): NextHandleFunction
/**
         * Returns middleware that parses all bodies as a Buffer and only looks at requests
         * where the Content-Type header matches the type option.
         */
fun raw(options: Options = definedExternally): NextHandleFunction
/**
         * Returns middleware that parses all bodies as a string and only looks at requests
         * where the Content-Type header matches the type option.
         */
fun text(options: OptionsText = definedExternally): NextHandleFunction
/**
         * Returns middleware that only parses urlencoded bodies and only looks at requests
         * where the Content-Type header matches the type option
         */
fun urlencoded(options: OptionsUrlencoded = definedExternally): NextHandleFunction
}
