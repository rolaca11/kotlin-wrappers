import ts from "typescript";

export default function (node, context, render) {
    if(
        ts.isQualifiedName(node) &&
        ts.isIdentifier(node.left)
    ) {
        if(node.left.text === "http") {
            return `node.http.${render(node.right)}`
        }
    }

    return null
}
