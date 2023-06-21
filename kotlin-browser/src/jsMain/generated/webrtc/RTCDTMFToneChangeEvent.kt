// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCDTMFToneChangeEventInit : EventInit {
    var tone: String?
}

open external class RTCDTMFToneChangeEvent(
    override val type: EventType<RTCDTMFToneChangeEvent>,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFToneChangeEvent/tone) */
    val tone: String

    companion object
}
