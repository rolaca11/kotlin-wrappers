import ts from "typescript";
import util from "util";

export default function (node, context, render) {
        if(
            ts.isTypeReferenceNode(node)
            && ts.isQualifiedName(node.typeName)
        ) {
            if(node.typeName?.right.text === "ServerResponse") {
                return `${render(node)}<*>`
            }
            if(node.typeName?.right.text === "Server") {
                return `${render(node)}<*, *>`
            }
        }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Function"
        && !node.typeArguments
    ) {
        if (
            ts.isParameter(node.parent)
            && ts.isIdentifier(node.parent.name)
            && node.parent.name.text === "listener"
        ) {
            return `${render(node.typeName)}<Unit>`
        }

        return `${render(node.typeName)}<*>`
    }

    return null
}
