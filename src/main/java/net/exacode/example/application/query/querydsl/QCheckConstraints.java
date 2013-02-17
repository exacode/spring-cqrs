package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCheckConstraints is a Querydsl query type for QCheckConstraints
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCheckConstraints extends com.mysema.query.sql.RelationalPathBase<QCheckConstraints> {

    private static final long serialVersionUID = 116066898;

    public static final QCheckConstraints checkConstraints = new QCheckConstraints("check_constraints");

    public final SimplePath<Object> checkClause = createSimple("check_clause", Object.class);

    public final SimplePath<Object> constraintCatalog = createSimple("constraint_catalog", Object.class);

    public final SimplePath<Object> constraintName = createSimple("constraint_name", Object.class);

    public final SimplePath<Object> constraintSchema = createSimple("constraint_schema", Object.class);

    public QCheckConstraints(String variable) {
        super(QCheckConstraints.class, forVariable(variable), "information_schema", "check_constraints");
    }

    @SuppressWarnings("all")
    public QCheckConstraints(Path<? extends QCheckConstraints> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "check_constraints");
    }

    public QCheckConstraints(PathMetadata<?> metadata) {
        super(QCheckConstraints.class, metadata, "information_schema", "check_constraints");
    }

}

