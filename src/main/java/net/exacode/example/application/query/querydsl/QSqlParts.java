package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlParts is a Querydsl query type for QSqlParts
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlParts extends com.mysema.query.sql.RelationalPathBase<QSqlParts> {

    private static final long serialVersionUID = -1685981194;

    public static final QSqlParts sqlParts = new QSqlParts("sql_parts");

    public final SimplePath<Object> comments = createSimple("comments", Object.class);

    public final SimplePath<Object> featureId = createSimple("feature_id", Object.class);

    public final SimplePath<Object> featureName = createSimple("feature_name", Object.class);

    public final SimplePath<Object> isSupported = createSimple("is_supported", Object.class);

    public final SimplePath<Object> isVerifiedBy = createSimple("is_verified_by", Object.class);

    public QSqlParts(String variable) {
        super(QSqlParts.class, forVariable(variable), "information_schema", "sql_parts");
    }

    @SuppressWarnings("all")
    public QSqlParts(Path<? extends QSqlParts> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_parts");
    }

    public QSqlParts(PathMetadata<?> metadata) {
        super(QSqlParts.class, metadata, "information_schema", "sql_parts");
    }

}

