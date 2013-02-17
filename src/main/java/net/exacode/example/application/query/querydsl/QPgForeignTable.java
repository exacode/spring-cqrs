package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignTable is a Querydsl query type for QPgForeignTable
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignTable extends com.mysema.query.sql.RelationalPathBase<QPgForeignTable> {

    private static final long serialVersionUID = -1674138059;

    public static final QPgForeignTable pgForeignTable = new QPgForeignTable("pg_foreign_table");

    public final SimplePath<Object[]> ftoptions = createSimple("ftoptions", Object[].class);

    public final NumberPath<Long> ftrelid = createNumber("ftrelid", Long.class);

    public final NumberPath<Long> ftserver = createNumber("ftserver", Long.class);

    public QPgForeignTable(String variable) {
        super(QPgForeignTable.class, forVariable(variable), "pg_catalog", "pg_foreign_table");
    }

    @SuppressWarnings("all")
    public QPgForeignTable(Path<? extends QPgForeignTable> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_table");
    }

    public QPgForeignTable(PathMetadata<?> metadata) {
        super(QPgForeignTable.class, metadata, "pg_catalog", "pg_foreign_table");
    }

}

