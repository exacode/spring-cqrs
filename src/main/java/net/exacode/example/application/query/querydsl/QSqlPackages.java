package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlPackages is a Querydsl query type for QSqlPackages
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlPackages extends com.mysema.query.sql.RelationalPathBase<QSqlPackages> {

    private static final long serialVersionUID = 2138593303;

    public static final QSqlPackages sqlPackages = new QSqlPackages("sql_packages");

    public final SimplePath<Object> comments = createSimple("comments", Object.class);

    public final SimplePath<Object> featureId = createSimple("feature_id", Object.class);

    public final SimplePath<Object> featureName = createSimple("feature_name", Object.class);

    public final SimplePath<Object> isSupported = createSimple("is_supported", Object.class);

    public final SimplePath<Object> isVerifiedBy = createSimple("is_verified_by", Object.class);

    public QSqlPackages(String variable) {
        super(QSqlPackages.class, forVariable(variable), "information_schema", "sql_packages");
    }

    @SuppressWarnings("all")
    public QSqlPackages(Path<? extends QSqlPackages> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_packages");
    }

    public QSqlPackages(PathMetadata<?> metadata) {
        super(QSqlPackages.class, metadata, "information_schema", "sql_packages");
    }

}

