package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgIndexIndrelidIndex is a Querydsl query type for QPgIndexIndrelidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgIndexIndrelidIndex extends com.mysema.query.sql.RelationalPathBase<QPgIndexIndrelidIndex> {

    private static final long serialVersionUID = 1103816134;

    public static final QPgIndexIndrelidIndex pgIndexIndrelidIndex = new QPgIndexIndrelidIndex("pg_index_indrelid_index");

    public final NumberPath<Long> indrelid = createNumber("indrelid", Long.class);

    public QPgIndexIndrelidIndex(String variable) {
        super(QPgIndexIndrelidIndex.class, forVariable(variable), "pg_catalog", "pg_index_indrelid_index");
    }

    @SuppressWarnings("all")
    public QPgIndexIndrelidIndex(Path<? extends QPgIndexIndrelidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_index_indrelid_index");
    }

    public QPgIndexIndrelidIndex(PathMetadata<?> metadata) {
        super(QPgIndexIndrelidIndex.class, metadata, "pg_catalog", "pg_index_indrelid_index");
    }

}

