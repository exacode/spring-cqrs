package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QReferentialConstraints is a Querydsl query type for QReferentialConstraints
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QReferentialConstraints extends com.mysema.query.sql.RelationalPathBase<QReferentialConstraints> {

    private static final long serialVersionUID = -1857043535;

    public static final QReferentialConstraints referentialConstraints = new QReferentialConstraints("referential_constraints");

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public final SimplePath<Object> deleteRule = createSimple("delete_rule", Object.class);

    public final SimplePath<Object> matchOption = createSimple("match_option", Object.class);

    public final SimplePath<Object> uniqueConstraintCatalog = createSimple("unique_constraint_catalog", Object.class);

    public final SimplePath<Object> uniqueConstraintName = createSimple("unique_constraint_name", Object.class);

    public final SimplePath<Object> uniqueConstraintSchema = createSimple("unique_constraint_schema", Object.class);

    public final SimplePath<Object> updateRule = createSimple("update_rule", Object.class);

    public QReferentialConstraints(String variable) {
        super(QReferentialConstraints.class, forVariable(variable), "information_schema", "referential_constraints");
    }

    @SuppressWarnings("all")
    public QReferentialConstraints(Path<? extends QReferentialConstraints> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "referential_constraints");
    }

    public QReferentialConstraints(PathMetadata<?> metadata) {
        super(QReferentialConstraints.class, metadata, "information_schema", "referential_constraints");
    }

}

