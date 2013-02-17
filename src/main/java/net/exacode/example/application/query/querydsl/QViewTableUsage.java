package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QViewTableUsage is a Querydsl query type for QViewTableUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QViewTableUsage extends com.mysema.query.sql.RelationalPathBase<QViewTableUsage> {

    private static final long serialVersionUID = -1971542468;

    public static final QViewTableUsage viewTableUsage = new QViewTableUsage("view_table_usage");

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> viewCatalog = createSimple("view_catalog", Object.class);

    public final SimplePath<Object> viewName = createSimple("view_name", Object.class);

    public final SimplePath<Object> viewSchema = createSimple("view_schema", Object.class);

    public QViewTableUsage(String variable) {
        super(QViewTableUsage.class, forVariable(variable), "information_schema", "view_table_usage");
    }

    @SuppressWarnings("all")
    public QViewTableUsage(Path<? extends QViewTableUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "view_table_usage");
    }

    public QViewTableUsage(PathMetadata<?> metadata) {
        super(QViewTableUsage.class, metadata, "information_schema", "view_table_usage");
    }

}

