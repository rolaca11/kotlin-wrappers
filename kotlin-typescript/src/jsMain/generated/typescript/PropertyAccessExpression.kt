// Automatically generated - do not modify!

package typescript

sealed external interface PropertyAccessExpression : MemberExpression, NamedDeclaration,
    Union.PropertyAccessExpression_ {
    override val kind: SyntaxKind.PropertyAccessExpression
    val expression: LeftHandSideExpression
    val questionDotToken: QuestionDotToken?
    override val name: MemberName
}
