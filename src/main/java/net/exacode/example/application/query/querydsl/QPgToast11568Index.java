package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11568Index is a Querydsl query type for QPgToast11568Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11568Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11568Index> {

    private static final long serialVersionUID = 130149415;

    public static final QPgToast11568Index pgToast11568Index = new QPgToast11568Index("pg_toast_11568_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11568Index(String variable) {
        super(QPgToast11568Index.class, forVariable(variable), "pg_toast", "pg_toast_11568_index");
    }

    @SuppressWarnings("all")
    public QPgToast11568Index(Path<? extends QPgToast11568Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11568_index");
    }

    public QPgToast11568Index(PathMetadata<?> metadata) {
        super(QPgToast11568Index.class, metadata, "pg_toast", "pg_toast_11568_index");
    }

}

