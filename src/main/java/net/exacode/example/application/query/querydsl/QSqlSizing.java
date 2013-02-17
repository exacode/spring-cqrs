package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSqlSizing is a Querydsl query type for QSqlSizing
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QSqlSizing extends com.mysema.query.sql.RelationalPathBase<QSqlSizing> {

    private static final long serialVersionUID = -632306136;

    public static final QSqlSizing sqlSizing = new QSqlSizing("sql_sizing");

    public final SimplePath<Object> comments = createSimple("comments", Object.class);

    public final SimplePath<Object> sizingId = createSimple("sizing_id", Object.class);

    public final SimplePath<Object> sizingName = createSimple("sizing_name", Object.class);

    public final SimplePath<Object> supportedValue = createSimple("supported_value", Object.class);

    public QSqlSizing(String variable) {
        super(QSqlSizing.class, forVariable(variable), "information_schema", "sql_sizing");
    }

    @SuppressWarnings("all")
    public QSqlSizing(Path<? extends QSqlSizing> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "sql_sizing");
    }

    public QSqlSizing(PathMetadata<?> metadata) {
        super(QSqlSizing.class, metadata, "information_schema", "sql_sizing");
    }

}

