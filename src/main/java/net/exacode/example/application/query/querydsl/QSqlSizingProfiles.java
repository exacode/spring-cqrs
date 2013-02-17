package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlSizingProfiles is a Querydsl query type for QSqlSizingProfiles
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlSizingProfiles extends com.mysema.query.sql.RelationalPathBase<QSqlSizingProfiles> {

    private static final long serialVersionUID = -67621326;

    public static final QSqlSizingProfiles sqlSizingProfiles = new QSqlSizingProfiles("sql_sizing_profiles");

    public final SimplePath<Object> comments = createSimple("comments", Object.class);

    public final SimplePath<Object> profileId = createSimple("profile_id", Object.class);

    public final SimplePath<Object> requiredValue = createSimple("required_value", Object.class);

    public final SimplePath<Object> sizingId = createSimple("sizing_id", Object.class);

    public final SimplePath<Object> sizingName = createSimple("sizing_name", Object.class);

    public QSqlSizingProfiles(String variable) {
        super(QSqlSizingProfiles.class, forVariable(variable), "information_schema", "sql_sizing_profiles");
    }

    @SuppressWarnings("all")
    public QSqlSizingProfiles(Path<? extends QSqlSizingProfiles> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_sizing_profiles");
    }

    public QSqlSizingProfiles(PathMetadata<?> metadata) {
        super(QSqlSizingProfiles.class, metadata, "information_schema", "sql_sizing_profiles");
    }

}

