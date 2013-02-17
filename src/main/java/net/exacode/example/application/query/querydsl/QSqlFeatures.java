package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlFeatures is a Querydsl query type for QSqlFeatures
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlFeatures extends com.mysema.query.sql.RelationalPathBase<QSqlFeatures> {

    private static final long serialVersionUID = 1097066343;

    public static final QSqlFeatures sqlFeatures = new QSqlFeatures("sql_features");

    public final SimplePath<Object> comments = createSimple("comments", Object.class);

    public final SimplePath<Object> featureId = createSimple("feature_id", Object.class);

    public final SimplePath<Object> featureName = createSimple("feature_name", Object.class);

    public final SimplePath<Object> isSupported = createSimple("is_supported", Object.class);

    public final SimplePath<Object> isVerifiedBy = createSimple("is_verified_by", Object.class);

    public final SimplePath<Object> subFeatureId = createSimple("sub_feature_id", Object.class);

    public final SimplePath<Object> subFeatureName = createSimple("sub_feature_name", Object.class);

    public QSqlFeatures(String variable) {
        super(QSqlFeatures.class, forVariable(variable), "information_schema", "sql_features");
    }

    @SuppressWarnings("all")
    public QSqlFeatures(Path<? extends QSqlFeatures> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_features");
    }

    public QSqlFeatures(PathMetadata<?> metadata) {
        super(QSqlFeatures.class, metadata, "information_schema", "sql_features");
    }

}

