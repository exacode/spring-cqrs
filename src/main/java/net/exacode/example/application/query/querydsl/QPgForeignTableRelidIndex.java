package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignTableRelidIndex is a Querydsl query type for QPgForeignTableRelidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignTableRelidIndex extends com.mysema.query.sql.RelationalPathBase<QPgForeignTableRelidIndex> {

    private static final long serialVersionUID = -2007086637;

    public static final QPgForeignTableRelidIndex pgForeignTableRelidIndex = new QPgForeignTableRelidIndex("pg_foreign_table_relid_index");

    public final NumberPath<Long> ftrelid = createNumber("ftrelid", Long.class);

    public QPgForeignTableRelidIndex(String variable) {
        super(QPgForeignTableRelidIndex.class, forVariable(variable), "pg_catalog", "pg_foreign_table_relid_index");
    }

    @SuppressWarnings("all")
    public QPgForeignTableRelidIndex(Path<? extends QPgForeignTableRelidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_table_relid_index");
    }

    public QPgForeignTableRelidIndex(PathMetadata<?> metadata) {
        super(QPgForeignTableRelidIndex.class, metadata, "pg_catalog", "pg_foreign_table_relid_index");
    }

}

