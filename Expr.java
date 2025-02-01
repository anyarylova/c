// File generated by the BNF Converter (bnfc 2.9.5).

package org.syntax.stella.Absyn;

public abstract class Expr implements java.io.Serializable {
  public abstract <R,A> R accept(Expr.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(org.syntax.stella.Absyn.Sequence p, A arg);
    public R visit(org.syntax.stella.Absyn.Assign p, A arg);
    public R visit(org.syntax.stella.Absyn.If p, A arg);
    public R visit(org.syntax.stella.Absyn.Let p, A arg);
    public R visit(org.syntax.stella.Absyn.LetRec p, A arg);
    public R visit(org.syntax.stella.Absyn.TypeAbstraction p, A arg);
    public R visit(org.syntax.stella.Absyn.LessThan p, A arg);
    public R visit(org.syntax.stella.Absyn.LessThanOrEqual p, A arg);
    public R visit(org.syntax.stella.Absyn.GreaterThan p, A arg);
    public R visit(org.syntax.stella.Absyn.GreaterThanOrEqual p, A arg);
    public R visit(org.syntax.stella.Absyn.Equal p, A arg);
    public R visit(org.syntax.stella.Absyn.NotEqual p, A arg);
    public R visit(org.syntax.stella.Absyn.TypeAsc p, A arg);
    public R visit(org.syntax.stella.Absyn.TypeCast p, A arg);
    public R visit(org.syntax.stella.Absyn.Abstraction p, A arg);
    public R visit(org.syntax.stella.Absyn.Variant p, A arg);
    public R visit(org.syntax.stella.Absyn.Match p, A arg);
    public R visit(org.syntax.stella.Absyn.List p, A arg);
    public R visit(org.syntax.stella.Absyn.Add p, A arg);
    public R visit(org.syntax.stella.Absyn.Subtract p, A arg);
    public R visit(org.syntax.stella.Absyn.LogicOr p, A arg);
    public R visit(org.syntax.stella.Absyn.Multiply p, A arg);
    public R visit(org.syntax.stella.Absyn.Divide p, A arg);
    public R visit(org.syntax.stella.Absyn.LogicAnd p, A arg);
    public R visit(org.syntax.stella.Absyn.Ref p, A arg);
    public R visit(org.syntax.stella.Absyn.Deref p, A arg);
    public R visit(org.syntax.stella.Absyn.Application p, A arg);
    public R visit(org.syntax.stella.Absyn.TypeApplication p, A arg);
    public R visit(org.syntax.stella.Absyn.DotRecord p, A arg);
    public R visit(org.syntax.stella.Absyn.DotTuple p, A arg);
    public R visit(org.syntax.stella.Absyn.Tuple p, A arg);
    public R visit(org.syntax.stella.Absyn.Record p, A arg);
    public R visit(org.syntax.stella.Absyn.ConsList p, A arg);
    public R visit(org.syntax.stella.Absyn.Head p, A arg);
    public R visit(org.syntax.stella.Absyn.IsEmpty p, A arg);
    public R visit(org.syntax.stella.Absyn.Tail p, A arg);
    public R visit(org.syntax.stella.Absyn.Panic p, A arg);
    public R visit(org.syntax.stella.Absyn.Throw p, A arg);
    public R visit(org.syntax.stella.Absyn.TryCatch p, A arg);
    public R visit(org.syntax.stella.Absyn.TryWith p, A arg);
    public R visit(org.syntax.stella.Absyn.TryCastAs p, A arg);
    public R visit(org.syntax.stella.Absyn.Inl p, A arg);
    public R visit(org.syntax.stella.Absyn.Inr p, A arg);
    public R visit(org.syntax.stella.Absyn.Succ p, A arg);
    public R visit(org.syntax.stella.Absyn.LogicNot p, A arg);
    public R visit(org.syntax.stella.Absyn.Pred p, A arg);
    public R visit(org.syntax.stella.Absyn.IsZero p, A arg);
    public R visit(org.syntax.stella.Absyn.Fix p, A arg);
    public R visit(org.syntax.stella.Absyn.NatRec p, A arg);
    public R visit(org.syntax.stella.Absyn.Fold p, A arg);
    public R visit(org.syntax.stella.Absyn.Unfold p, A arg);
    public R visit(org.syntax.stella.Absyn.ConstTrue p, A arg);
    public R visit(org.syntax.stella.Absyn.ConstFalse p, A arg);
    public R visit(org.syntax.stella.Absyn.ConstUnit p, A arg);
    public R visit(org.syntax.stella.Absyn.ConstInt p, A arg);
    public R visit(org.syntax.stella.Absyn.ConstMemory p, A arg);
    public R visit(org.syntax.stella.Absyn.Var p, A arg);

  }

}
