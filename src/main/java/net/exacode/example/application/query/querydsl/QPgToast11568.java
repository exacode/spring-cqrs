package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11568 is a Querydsl query type for QPgToast11568
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11568 extends com.mysema.query.sql.RelationalPathBase<QPgToast11568> {

    private static final long serialVersionUID = -269011093;

    public static final QPgToast11568 pgToast11568 = new QPgToast11568("pg_toast_11568");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast11568> pgToast11568Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast11568(String variable) {
        super(QPgToast11568.class, forVariable(variable), "pg_toast", "pg_toast_11568");
    }

    @SuppressWarnings("all")
    public QPgToast11568(Path<? extends QPgToast11568> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11568");
    }

    public QPgToast11568(PathMetadata<?> metadata) {
        super(QPgToast11568.class, metadata, "pg_toast", "pg_toast_11568");
    }

}

