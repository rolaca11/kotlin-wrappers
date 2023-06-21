// Automatically generated - do not modify!

package web.xpath

import web.dom.Node

sealed external class XPathResult {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/booleanValue) */
    val booleanValue: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/invalidIteratorState) */
    val invalidIteratorState: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/numberValue) */
    val numberValue: Double

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/resultType) */
    val resultType: Short

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/singleNodeValue) */
    val singleNodeValue: Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/snapshotLength) */
    val snapshotLength: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/stringValue) */
    val stringValue: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/iterateNext) */
    fun iterateNext(): Node?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/snapshotItem) */
    fun snapshotItem(index: Int): Node?
    val ANY_TYPE: Short
    val NUMBER_TYPE: Short
    val STRING_TYPE: Short
    val BOOLEAN_TYPE: Short
    val UNORDERED_NODE_ITERATOR_TYPE: Short
    val ORDERED_NODE_ITERATOR_TYPE: Short
    val UNORDERED_NODE_SNAPSHOT_TYPE: Short
    val ORDERED_NODE_SNAPSHOT_TYPE: Short
    val ANY_UNORDERED_NODE_TYPE: Short
    val FIRST_ORDERED_NODE_TYPE: Short

    companion object {
        val ANY_TYPE: Short
        val NUMBER_TYPE: Short
        val STRING_TYPE: Short
        val BOOLEAN_TYPE: Short
        val UNORDERED_NODE_ITERATOR_TYPE: Short
        val ORDERED_NODE_ITERATOR_TYPE: Short
        val UNORDERED_NODE_SNAPSHOT_TYPE: Short
        val ORDERED_NODE_SNAPSHOT_TYPE: Short
        val ANY_UNORDERED_NODE_TYPE: Short
        val FIRST_ORDERED_NODE_TYPE: Short
    }
}
