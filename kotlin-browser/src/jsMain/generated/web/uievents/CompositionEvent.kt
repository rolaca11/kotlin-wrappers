// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.EventType

external interface CompositionEventInit : UIEventInit {
    var data: String?
}

open external class CompositionEvent(
    override val type: EventType<CompositionEvent>,
    init: CompositionEventInit = definedExternally,
) : UIEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data) */
    val data: String

    companion object
}
