// Automatically generated - do not modify!

package web.permissions

import kotlin.js.Promise

sealed external class Permissions {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query) */
    fun query(permissionDesc: PermissionDescriptor): Promise<PermissionStatus>
}
