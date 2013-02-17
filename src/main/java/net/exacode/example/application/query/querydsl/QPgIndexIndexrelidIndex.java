package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgIndexIndexrelidIndex is a Querydsl query type for QPgIndexIndexrelidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgIndexIndexrelidIndex extends com.mysema.query.sql.RelationalPathBase<QPgIndexIndexrelidIndex> {

    private static final long serialVersionUID = -712307527;

    public static final QPgIndexIndexrelidIndex pgIndexIndexrelidIndex = new QPgIndexIndexrelidIndex("pg_index_indexrelid_index");

    public final NumberPath<Long> indexrelid = createNumber("indexrelid", Long.class);

    public QPgIndexIndexrelidIndex(String variable) {
        super(QPgIndexIndexrelidIndex.class, forVariable(variable), "pg_catalog", "pg_index_indexrelid_index");
    }

    @SuppressWarnings("all")
    public QPgIndexIndexrelidIndex(Path<? extends QPgIndexIndexrelidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_index_indexrelid_index");
    }

    public QPgIndexIndexrelidIndex(PathMetadata<?> metadata) {
        super(QPgIndexIndexrelidIndex.class, metadata, "pg_catalog", "pg_index_indexrelid_index");
    }

}

