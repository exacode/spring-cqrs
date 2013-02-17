package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QColumnUdtUsage is a Querydsl query type for QColumnUdtUsage
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QColumnUdtUsage extends com.mysema.query.sql.RelationalPathBase<QColumnUdtUsage> {

    private static final long serialVersionUID = -121096810;

    public static final QColumnUdtUsage columnUdtUsage = new QColumnUdtUsage("column_udt_usage");

    public final SimplePath<Object> columnName = createSimple("column_name", Object.class);

    public final SimplePath<Object> tableCatalog = createSimple("table_catalog", Object.class);

    public final SimplePath<Object> tableName = createSimple("table_name", Object.class);

    public final SimplePath<Object> tableSchema = createSimple("table_schema", Object.class);

    public final SimplePath<Object> udtCatalog = createSimple("udt_catalog", Object.class);

    public final SimplePath<Object> udtName = createSimple("udt_name", Object.class);

    public final SimplePath<Object> udtSchema = createSimple("udt_schema", Object.class);

    public QColumnUdtUsage(String variable) {
        super(QColumnUdtUsage.class, forVariable(variable), "information_schema", "column_udt_usage");
    }

    @SuppressWarnings("all")
    public QColumnUdtUsage(Path<? extends QColumnUdtUsage> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "column_udt_usage");
    }

    public QColumnUdtUsage(PathMetadata<?> metadata) {
        super(QColumnUdtUsage.class, metadata, "information_schema", "column_udt_usage");
    }

}

