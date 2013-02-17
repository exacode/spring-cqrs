package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2609Index is a Querydsl query type for QPgToast2609Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2609Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2609Index> {

    private static final long serialVersionUID = -1026273447;

    public static final QPgToast2609Index pgToast2609Index = new QPgToast2609Index("pg_toast_2609_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2609Index(String variable) {
        super(QPgToast2609Index.class, forVariable(variable), "pg_toast", "pg_toast_2609_index");
    }

    @SuppressWarnings("all")
    public QPgToast2609Index(Path<? extends QPgToast2609Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2609_index");
    }

    public QPgToast2609Index(PathMetadata<?> metadata) {
        super(QPgToast2609Index.class, metadata, "pg_toast", "pg_toast_2609_index");
    }

}

