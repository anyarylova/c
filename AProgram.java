// File generated by the BNF Converter (bnfc 2.9.5).

package org.syntax.stella.Absyn;

public class AProgram  extends Program {
  public final LanguageDecl languagedecl_;
  public final ListExtension listextension_;
  public final ListDecl listdecl_;
  public int line_num, col_num, offset;
  public AProgram(LanguageDecl p1, ListExtension p2, ListDecl p3) { languagedecl_ = p1; listextension_ = p2; listdecl_ = p3; }

  public <R,A> R accept(org.syntax.stella.Absyn.Program.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof org.syntax.stella.Absyn.AProgram) {
      org.syntax.stella.Absyn.AProgram x = (org.syntax.stella.Absyn.AProgram)o;
      return this.languagedecl_.equals(x.languagedecl_) && this.listextension_.equals(x.listextension_) && this.listdecl_.equals(x.listdecl_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.languagedecl_.hashCode())+this.listextension_.hashCode())+this.listdecl_.hashCode();
  }


}
