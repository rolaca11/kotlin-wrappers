@file:JsModule("electron")

package electron


open external class Tray : electron.core.Tray {
    constructor (image: NativeImage, guid: String = definedExternally)

    constructor (image: String, guid: String = definedExternally)
}
