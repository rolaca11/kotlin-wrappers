// Automatically generated - do not modify!

@file:JsModule("@actions/http-client")

package actions.http.client

import kotlin.js.Promise

external class HttpClientResponse {
    constructor(message: node.http.IncomingMessage)

    var message: node.http.IncomingMessage
    fun readBody(): Promise<String>
}