package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast16398Index is a Querydsl query type for QPgToast16398Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast16398Index extends com.mysema.query.sql.RelationalPathBase<QPgToast16398Index> {

    private static final long serialVersionUID = -1140297935;

    public static final QPgToast16398Index pgToast16398Index = new QPgToast16398Index("pg_toast_16398_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast16398Index(String variable) {
        super(QPgToast16398Index.class, forVariable(variable), "pg_toast", "pg_toast_16398_index");
    }

    @SuppressWarnings("all")
    public QPgToast16398Index(Path<? extends QPgToast16398Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_16398_index");
    }

    public QPgToast16398Index(PathMetadata<?> metadata) {
        super(QPgToast16398Index.class, metadata, "pg_toast", "pg_toast_16398_index");
    }

}

