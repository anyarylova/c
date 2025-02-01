// File generated by the BNF Converter (bnfc 2.9.5).

package org.syntax.stella;
/** Composition Visitor
*/

public class ComposVisitor<A> implements
  org.syntax.stella.Absyn.Program.Visitor<org.syntax.stella.Absyn.Program,A>,
  org.syntax.stella.Absyn.LanguageDecl.Visitor<org.syntax.stella.Absyn.LanguageDecl,A>,
  org.syntax.stella.Absyn.Extension.Visitor<org.syntax.stella.Absyn.Extension,A>,
  org.syntax.stella.Absyn.Decl.Visitor<org.syntax.stella.Absyn.Decl,A>,
  org.syntax.stella.Absyn.LocalDecl.Visitor<org.syntax.stella.Absyn.LocalDecl,A>,
  org.syntax.stella.Absyn.Annotation.Visitor<org.syntax.stella.Absyn.Annotation,A>,
  org.syntax.stella.Absyn.ParamDecl.Visitor<org.syntax.stella.Absyn.ParamDecl,A>,
  org.syntax.stella.Absyn.ReturnType.Visitor<org.syntax.stella.Absyn.ReturnType,A>,
  org.syntax.stella.Absyn.ThrowType.Visitor<org.syntax.stella.Absyn.ThrowType,A>,
  org.syntax.stella.Absyn.Type.Visitor<org.syntax.stella.Absyn.Type,A>,
  org.syntax.stella.Absyn.MatchCase.Visitor<org.syntax.stella.Absyn.MatchCase,A>,
  org.syntax.stella.Absyn.OptionalTyping.Visitor<org.syntax.stella.Absyn.OptionalTyping,A>,
  org.syntax.stella.Absyn.PatternData.Visitor<org.syntax.stella.Absyn.PatternData,A>,
  org.syntax.stella.Absyn.ExprData.Visitor<org.syntax.stella.Absyn.ExprData,A>,
  org.syntax.stella.Absyn.Pattern.Visitor<org.syntax.stella.Absyn.Pattern,A>,
  org.syntax.stella.Absyn.LabelledPattern.Visitor<org.syntax.stella.Absyn.LabelledPattern,A>,
  org.syntax.stella.Absyn.Binding.Visitor<org.syntax.stella.Absyn.Binding,A>,
  org.syntax.stella.Absyn.Expr.Visitor<org.syntax.stella.Absyn.Expr,A>,
  org.syntax.stella.Absyn.PatternBinding.Visitor<org.syntax.stella.Absyn.PatternBinding,A>,
  org.syntax.stella.Absyn.VariantFieldType.Visitor<org.syntax.stella.Absyn.VariantFieldType,A>,
  org.syntax.stella.Absyn.RecordFieldType.Visitor<org.syntax.stella.Absyn.RecordFieldType,A>,
  org.syntax.stella.Absyn.Typing.Visitor<org.syntax.stella.Absyn.Typing,A>
{
    /* Program */
    public org.syntax.stella.Absyn.Program visit(org.syntax.stella.Absyn.AProgram p, A arg)
    {
      org.syntax.stella.Absyn.LanguageDecl languagedecl_ = p.languagedecl_.accept(this, arg);
      org.syntax.stella.Absyn.ListExtension listextension_ = new org.syntax.stella.Absyn.ListExtension();
      for (org.syntax.stella.Absyn.Extension x : p.listextension_)
      {
        listextension_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.ListDecl listdecl_ = new org.syntax.stella.Absyn.ListDecl();
      for (org.syntax.stella.Absyn.Decl x : p.listdecl_)
      {
        listdecl_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.AProgram(languagedecl_, listextension_, listdecl_);
    }

    /* LanguageDecl */
    public org.syntax.stella.Absyn.LanguageDecl visit(org.syntax.stella.Absyn.LanguageCore p, A arg)
    {
      return new org.syntax.stella.Absyn.LanguageCore();
    }

    /* Extension */
    public org.syntax.stella.Absyn.Extension visit(org.syntax.stella.Absyn.AnExtension p, A arg)
    {
      org.syntax.stella.Absyn.ListExtensionName listextensionname_ = p.listextensionname_;
      return new org.syntax.stella.Absyn.AnExtension(listextensionname_);
    }

    /* Decl */
    public org.syntax.stella.Absyn.Decl visit(org.syntax.stella.Absyn.DeclFun p, A arg)
    {
      org.syntax.stella.Absyn.ListAnnotation listannotation_ = new org.syntax.stella.Absyn.ListAnnotation();
      for (org.syntax.stella.Absyn.Annotation x : p.listannotation_)
      {
        listannotation_.add(x.accept(this,arg));
      }
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.ListParamDecl listparamdecl_ = new org.syntax.stella.Absyn.ListParamDecl();
      for (org.syntax.stella.Absyn.ParamDecl x : p.listparamdecl_)
      {
        listparamdecl_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.ReturnType returntype_ = p.returntype_.accept(this, arg);
      org.syntax.stella.Absyn.ThrowType throwtype_ = p.throwtype_.accept(this, arg);
      org.syntax.stella.Absyn.ListDecl listdecl_ = new org.syntax.stella.Absyn.ListDecl();
      for (org.syntax.stella.Absyn.Decl x : p.listdecl_)
      {
        listdecl_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.DeclFun(listannotation_, stellaident_, listparamdecl_, returntype_, throwtype_, listdecl_, expr_);
    }
    public org.syntax.stella.Absyn.Decl visit(org.syntax.stella.Absyn.DeclFunGeneric p, A arg)
    {
      org.syntax.stella.Absyn.ListAnnotation listannotation_ = new org.syntax.stella.Absyn.ListAnnotation();
      for (org.syntax.stella.Absyn.Annotation x : p.listannotation_)
      {
        listannotation_.add(x.accept(this,arg));
      }
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.ListStellaIdent liststellaident_ = p.liststellaident_;
      org.syntax.stella.Absyn.ListParamDecl listparamdecl_ = new org.syntax.stella.Absyn.ListParamDecl();
      for (org.syntax.stella.Absyn.ParamDecl x : p.listparamdecl_)
      {
        listparamdecl_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.ReturnType returntype_ = p.returntype_.accept(this, arg);
      org.syntax.stella.Absyn.ThrowType throwtype_ = p.throwtype_.accept(this, arg);
      org.syntax.stella.Absyn.ListDecl listdecl_ = new org.syntax.stella.Absyn.ListDecl();
      for (org.syntax.stella.Absyn.Decl x : p.listdecl_)
      {
        listdecl_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.DeclFunGeneric(listannotation_, stellaident_, liststellaident_, listparamdecl_, returntype_, throwtype_, listdecl_, expr_);
    }
    public org.syntax.stella.Absyn.Decl visit(org.syntax.stella.Absyn.DeclTypeAlias p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.DeclTypeAlias(stellaident_, type_);
    }
    public org.syntax.stella.Absyn.Decl visit(org.syntax.stella.Absyn.DeclExceptionType p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.DeclExceptionType(type_);
    }
    public org.syntax.stella.Absyn.Decl visit(org.syntax.stella.Absyn.DeclExceptionVariant p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.DeclExceptionVariant(stellaident_, type_);
    }

    /* LocalDecl */
    public org.syntax.stella.Absyn.LocalDecl visit(org.syntax.stella.Absyn.ALocalDecl p, A arg)
    {
      org.syntax.stella.Absyn.Decl decl_ = p.decl_.accept(this, arg);
      return new org.syntax.stella.Absyn.ALocalDecl(decl_);
    }

    /* Annotation */
    public org.syntax.stella.Absyn.Annotation visit(org.syntax.stella.Absyn.InlineAnnotation p, A arg)
    {
      return new org.syntax.stella.Absyn.InlineAnnotation();
    }

    /* ParamDecl */
    public org.syntax.stella.Absyn.ParamDecl visit(org.syntax.stella.Absyn.AParamDecl p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.AParamDecl(stellaident_, type_);
    }

    /* ReturnType */
    public org.syntax.stella.Absyn.ReturnType visit(org.syntax.stella.Absyn.NoReturnType p, A arg)
    {
      return new org.syntax.stella.Absyn.NoReturnType();
    }
    public org.syntax.stella.Absyn.ReturnType visit(org.syntax.stella.Absyn.SomeReturnType p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.SomeReturnType(type_);
    }

    /* ThrowType */
    public org.syntax.stella.Absyn.ThrowType visit(org.syntax.stella.Absyn.NoThrowType p, A arg)
    {
      return new org.syntax.stella.Absyn.NoThrowType();
    }
    public org.syntax.stella.Absyn.ThrowType visit(org.syntax.stella.Absyn.SomeThrowType p, A arg)
    {
      org.syntax.stella.Absyn.ListType listtype_ = new org.syntax.stella.Absyn.ListType();
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        listtype_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.SomeThrowType(listtype_);
    }

    /* Type */
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeAuto p, A arg)
    {
      return new org.syntax.stella.Absyn.TypeAuto();
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeFun p, A arg)
    {
      org.syntax.stella.Absyn.ListType listtype_ = new org.syntax.stella.Absyn.ListType();
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        listtype_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeFun(listtype_, type_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeForAll p, A arg)
    {
      org.syntax.stella.Absyn.ListStellaIdent liststellaident_ = p.liststellaident_;
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeForAll(liststellaident_, type_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeRec p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeRec(stellaident_, type_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeSum p, A arg)
    {
      org.syntax.stella.Absyn.Type type_1 = p.type_1.accept(this, arg);
      org.syntax.stella.Absyn.Type type_2 = p.type_2.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeSum(type_1, type_2);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeTuple p, A arg)
    {
      org.syntax.stella.Absyn.ListType listtype_ = new org.syntax.stella.Absyn.ListType();
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        listtype_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.TypeTuple(listtype_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeRecord p, A arg)
    {
      org.syntax.stella.Absyn.ListRecordFieldType listrecordfieldtype_ = new org.syntax.stella.Absyn.ListRecordFieldType();
      for (org.syntax.stella.Absyn.RecordFieldType x : p.listrecordfieldtype_)
      {
        listrecordfieldtype_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.TypeRecord(listrecordfieldtype_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeVariant p, A arg)
    {
      org.syntax.stella.Absyn.ListVariantFieldType listvariantfieldtype_ = new org.syntax.stella.Absyn.ListVariantFieldType();
      for (org.syntax.stella.Absyn.VariantFieldType x : p.listvariantfieldtype_)
      {
        listvariantfieldtype_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.TypeVariant(listvariantfieldtype_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeList p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeList(type_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeBool p, A arg)
    {
      return new org.syntax.stella.Absyn.TypeBool();
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeNat p, A arg)
    {
      return new org.syntax.stella.Absyn.TypeNat();
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeUnit p, A arg)
    {
      return new org.syntax.stella.Absyn.TypeUnit();
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeTop p, A arg)
    {
      return new org.syntax.stella.Absyn.TypeTop();
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeBottom p, A arg)
    {
      return new org.syntax.stella.Absyn.TypeBottom();
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeRef p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeRef(type_);
    }
    public org.syntax.stella.Absyn.Type visit(org.syntax.stella.Absyn.TypeVar p, A arg)
    {
      String stellaident_ = p.stellaident_;
      return new org.syntax.stella.Absyn.TypeVar(stellaident_);
    }

    /* MatchCase */
    public org.syntax.stella.Absyn.MatchCase visit(org.syntax.stella.Absyn.AMatchCase p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.AMatchCase(pattern_, expr_);
    }

    /* OptionalTyping */
    public org.syntax.stella.Absyn.OptionalTyping visit(org.syntax.stella.Absyn.NoTyping p, A arg)
    {
      return new org.syntax.stella.Absyn.NoTyping();
    }
    public org.syntax.stella.Absyn.OptionalTyping visit(org.syntax.stella.Absyn.SomeTyping p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.SomeTyping(type_);
    }

    /* PatternData */
    public org.syntax.stella.Absyn.PatternData visit(org.syntax.stella.Absyn.NoPatternData p, A arg)
    {
      return new org.syntax.stella.Absyn.NoPatternData();
    }
    public org.syntax.stella.Absyn.PatternData visit(org.syntax.stella.Absyn.SomePatternData p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      return new org.syntax.stella.Absyn.SomePatternData(pattern_);
    }

    /* ExprData */
    public org.syntax.stella.Absyn.ExprData visit(org.syntax.stella.Absyn.NoExprData p, A arg)
    {
      return new org.syntax.stella.Absyn.NoExprData();
    }
    public org.syntax.stella.Absyn.ExprData visit(org.syntax.stella.Absyn.SomeExprData p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.SomeExprData(expr_);
    }

    /* Pattern */
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternCastAs p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternCastAs(pattern_, type_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternAsc p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternAsc(pattern_, type_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternVariant p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.PatternData patterndata_ = p.patterndata_.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternVariant(stellaident_, patterndata_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternInl p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternInl(pattern_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternInr p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternInr(pattern_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternTuple p, A arg)
    {
      org.syntax.stella.Absyn.ListPattern listpattern_ = new org.syntax.stella.Absyn.ListPattern();
      for (org.syntax.stella.Absyn.Pattern x : p.listpattern_)
      {
        listpattern_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.PatternTuple(listpattern_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternRecord p, A arg)
    {
      org.syntax.stella.Absyn.ListLabelledPattern listlabelledpattern_ = new org.syntax.stella.Absyn.ListLabelledPattern();
      for (org.syntax.stella.Absyn.LabelledPattern x : p.listlabelledpattern_)
      {
        listlabelledpattern_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.PatternRecord(listlabelledpattern_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternList p, A arg)
    {
      org.syntax.stella.Absyn.ListPattern listpattern_ = new org.syntax.stella.Absyn.ListPattern();
      for (org.syntax.stella.Absyn.Pattern x : p.listpattern_)
      {
        listpattern_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.PatternList(listpattern_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternCons p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_1 = p.pattern_1.accept(this, arg);
      org.syntax.stella.Absyn.Pattern pattern_2 = p.pattern_2.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternCons(pattern_1, pattern_2);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternFalse p, A arg)
    {
      return new org.syntax.stella.Absyn.PatternFalse();
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternTrue p, A arg)
    {
      return new org.syntax.stella.Absyn.PatternTrue();
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternUnit p, A arg)
    {
      return new org.syntax.stella.Absyn.PatternUnit();
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new org.syntax.stella.Absyn.PatternInt(integer_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternSucc p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      return new org.syntax.stella.Absyn.PatternSucc(pattern_);
    }
    public org.syntax.stella.Absyn.Pattern visit(org.syntax.stella.Absyn.PatternVar p, A arg)
    {
      String stellaident_ = p.stellaident_;
      return new org.syntax.stella.Absyn.PatternVar(stellaident_);
    }

    /* LabelledPattern */
    public org.syntax.stella.Absyn.LabelledPattern visit(org.syntax.stella.Absyn.ALabelledPattern p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      return new org.syntax.stella.Absyn.ALabelledPattern(stellaident_, pattern_);
    }

    /* Binding */
    public org.syntax.stella.Absyn.Binding visit(org.syntax.stella.Absyn.ABinding p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.ABinding(stellaident_, expr_);
    }

    /* Expr */
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Sequence p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Sequence(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Let p, A arg)
    {
      org.syntax.stella.Absyn.ListPatternBinding listpatternbinding_ = new org.syntax.stella.Absyn.ListPatternBinding();
      for (org.syntax.stella.Absyn.PatternBinding x : p.listpatternbinding_)
      {
        listpatternbinding_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Let(listpatternbinding_, expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.LetRec p, A arg)
    {
      org.syntax.stella.Absyn.ListPatternBinding listpatternbinding_ = new org.syntax.stella.Absyn.ListPatternBinding();
      for (org.syntax.stella.Absyn.PatternBinding x : p.listpatternbinding_)
      {
        listpatternbinding_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.LetRec(listpatternbinding_, expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TypeAbstraction p, A arg)
    {
      org.syntax.stella.Absyn.ListStellaIdent liststellaident_ = p.liststellaident_;
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeAbstraction(liststellaident_, expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Assign p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Assign(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.If p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_3 = p.expr_3.accept(this, arg);
      return new org.syntax.stella.Absyn.If(expr_1, expr_2, expr_3);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.LessThan p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.LessThan(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.LessThanOrEqual p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.LessThanOrEqual(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.GreaterThan p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.GreaterThan(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.GreaterThanOrEqual p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.GreaterThanOrEqual(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Equal p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Equal(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.NotEqual p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.NotEqual(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TypeAsc p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeAsc(expr_, type_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TypeCast p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.TypeCast(expr_, type_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Abstraction p, A arg)
    {
      org.syntax.stella.Absyn.ListParamDecl listparamdecl_ = new org.syntax.stella.Absyn.ListParamDecl();
      for (org.syntax.stella.Absyn.ParamDecl x : p.listparamdecl_)
      {
        listparamdecl_.add(x.accept(this,arg));
      }
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Abstraction(listparamdecl_, expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Variant p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.ExprData exprdata_ = p.exprdata_.accept(this, arg);
      return new org.syntax.stella.Absyn.Variant(stellaident_, exprdata_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Match p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      org.syntax.stella.Absyn.ListMatchCase listmatchcase_ = new org.syntax.stella.Absyn.ListMatchCase();
      for (org.syntax.stella.Absyn.MatchCase x : p.listmatchcase_)
      {
        listmatchcase_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.Match(expr_, listmatchcase_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.List p, A arg)
    {
      org.syntax.stella.Absyn.ListExpr listexpr_ = new org.syntax.stella.Absyn.ListExpr();
      for (org.syntax.stella.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.List(listexpr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Add p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Add(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Subtract p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Subtract(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.LogicOr p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.LogicOr(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Multiply p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Multiply(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Divide p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.Divide(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.LogicAnd p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.LogicAnd(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Ref p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Ref(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Deref p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Deref(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Application p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      org.syntax.stella.Absyn.ListExpr listexpr_ = new org.syntax.stella.Absyn.ListExpr();
      for (org.syntax.stella.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.Application(expr_, listexpr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TypeApplication p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      org.syntax.stella.Absyn.ListType listtype_ = new org.syntax.stella.Absyn.ListType();
      for (org.syntax.stella.Absyn.Type x : p.listtype_)
      {
        listtype_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.TypeApplication(expr_, listtype_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.DotRecord p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      String stellaident_ = p.stellaident_;
      return new org.syntax.stella.Absyn.DotRecord(expr_, stellaident_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.DotTuple p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      Integer integer_ = p.integer_;
      return new org.syntax.stella.Absyn.DotTuple(expr_, integer_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Tuple p, A arg)
    {
      org.syntax.stella.Absyn.ListExpr listexpr_ = new org.syntax.stella.Absyn.ListExpr();
      for (org.syntax.stella.Absyn.Expr x : p.listexpr_)
      {
        listexpr_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.Tuple(listexpr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Record p, A arg)
    {
      org.syntax.stella.Absyn.ListBinding listbinding_ = new org.syntax.stella.Absyn.ListBinding();
      for (org.syntax.stella.Absyn.Binding x : p.listbinding_)
      {
        listbinding_.add(x.accept(this,arg));
      }
      return new org.syntax.stella.Absyn.Record(listbinding_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.ConsList p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.ConsList(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Head p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Head(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.IsEmpty p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.IsEmpty(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Tail p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Tail(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Panic p, A arg)
    {
      return new org.syntax.stella.Absyn.Panic();
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Throw p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Throw(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TryCatch p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.TryCatch(expr_1, pattern_, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TryWith p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      return new org.syntax.stella.Absyn.TryWith(expr_1, expr_2);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.TryCastAs p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_3 = p.expr_3.accept(this, arg);
      return new org.syntax.stella.Absyn.TryCastAs(expr_1, type_, pattern_, expr_2, expr_3);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Inl p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Inl(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Inr p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Inr(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Succ p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Succ(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.LogicNot p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.LogicNot(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Pred p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Pred(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.IsZero p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.IsZero(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Fix p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Fix(expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.NatRec p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_1 = p.expr_1.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_2 = p.expr_2.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_3 = p.expr_3.accept(this, arg);
      return new org.syntax.stella.Absyn.NatRec(expr_1, expr_2, expr_3);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Fold p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Fold(type_, expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Unfold p, A arg)
    {
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.Unfold(type_, expr_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.ConstTrue p, A arg)
    {
      return new org.syntax.stella.Absyn.ConstTrue();
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.ConstFalse p, A arg)
    {
      return new org.syntax.stella.Absyn.ConstFalse();
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.ConstUnit p, A arg)
    {
      return new org.syntax.stella.Absyn.ConstUnit();
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.ConstInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new org.syntax.stella.Absyn.ConstInt(integer_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.ConstMemory p, A arg)
    {
      String memoryaddress_ = p.memoryaddress_;
      return new org.syntax.stella.Absyn.ConstMemory(memoryaddress_);
    }
    public org.syntax.stella.Absyn.Expr visit(org.syntax.stella.Absyn.Var p, A arg)
    {
      String stellaident_ = p.stellaident_;
      return new org.syntax.stella.Absyn.Var(stellaident_);
    }

    /* PatternBinding */
    public org.syntax.stella.Absyn.PatternBinding visit(org.syntax.stella.Absyn.APatternBinding p, A arg)
    {
      org.syntax.stella.Absyn.Pattern pattern_ = p.pattern_.accept(this, arg);
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      return new org.syntax.stella.Absyn.APatternBinding(pattern_, expr_);
    }

    /* VariantFieldType */
    public org.syntax.stella.Absyn.VariantFieldType visit(org.syntax.stella.Absyn.AVariantFieldType p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.OptionalTyping optionaltyping_ = p.optionaltyping_.accept(this, arg);
      return new org.syntax.stella.Absyn.AVariantFieldType(stellaident_, optionaltyping_);
    }

    /* RecordFieldType */
    public org.syntax.stella.Absyn.RecordFieldType visit(org.syntax.stella.Absyn.ARecordFieldType p, A arg)
    {
      String stellaident_ = p.stellaident_;
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.ARecordFieldType(stellaident_, type_);
    }

    /* Typing */
    public org.syntax.stella.Absyn.Typing visit(org.syntax.stella.Absyn.ATyping p, A arg)
    {
      org.syntax.stella.Absyn.Expr expr_ = p.expr_.accept(this, arg);
      org.syntax.stella.Absyn.Type type_ = p.type_.accept(this, arg);
      return new org.syntax.stella.Absyn.ATyping(expr_, type_);
    }
}
