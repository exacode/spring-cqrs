package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QViewColumnUsage is a Querydsl query type for QViewColumnUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QViewColumnUsage extends com.mysema.query.sql.RelationalPathBase<QViewColumnUsage> {

    private static final long serialVersionUID = 2143270210;

    public static final QViewColumnUsage viewColumnUsage = new QViewColumnUsage("view_column_usage");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> viewCatalog = createSimple("view_catalog", Object.class);

    public final SimplePath<Object> viewName = createSimple("view_name", Object.class);

    public final SimplePath<Object> viewSchema = createSimple("view_schema", Object.class);

    public QViewColumnUsage(String variable) {
        super(QViewColumnUsage.class, forVariable(variable), "information_schema", "view_column_usage");
    }

    @SuppressWarnings("all")
    public QViewColumnUsage(Path<? extends QViewColumnUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "view_column_usage");
    }

    public QViewColumnUsage(PathMetadata<?> metadata) {
        super(QViewColumnUsage.class, metadata, "information_schema", "view_column_usage");
    }

}

