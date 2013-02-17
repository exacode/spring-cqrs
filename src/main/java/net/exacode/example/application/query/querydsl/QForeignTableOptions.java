package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QForeignTableOptions is a Querydsl query type for QForeignTableOptions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QForeignTableOptions extends com.mysema.query.sql.RelationalPathBase<QForeignTableOptions> {

    private static final long serialVersionUID = 876767520;

    public static final QForeignTableOptions foreignTableOptions = new QForeignTableOptions("foreign_table_options");

    public final SimplePath<Object> foreignTableCatalog = createSimple("foreign_table_catalog", Object.class);

    public final StringPath foreignTableName = createString("foreign_table_name");

    public final StringPath foreignTableSchema = createString("foreign_table_schema");

    public final SimplePath<Object> optionName = createSimple("option_name", Object.class);

    public final SimplePath<Object> optionValue = createSimple("option_value", Object.class);

    public QForeignTableOptions(String variable) {
        super(QForeignTableOptions.class, forVariable(variable), "information_schema", "foreign_table_options");
    }

    @SuppressWarnings("all")
    public QForeignTableOptions(Path<? extends QForeignTableOptions> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "foreign_table_options");
    }

    public QForeignTableOptions(PathMetadata<?> metadata) {
        super(QForeignTableOptions.class, metadata, "information_schema", "foreign_table_options");
    }

}

