package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2396 is a Querydsl query type for QPgToast2396
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2396 extends com.mysema.query.sql.RelationalPathBase<QPgToast2396> {

    private static final long serialVersionUID = -8645942;

    public static final QPgToast2396 pgToast2396 = new QPgToast2396("pg_toast_2396");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2396> pgToast2396Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2396(String variable) {
        super(QPgToast2396.class, forVariable(variable), "pg_toast", "pg_toast_2396");
    }

    @SuppressWarnings("all")
    public QPgToast2396(Path<? extends QPgToast2396> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2396");
    }

    public QPgToast2396(PathMetadata<?> metadata) {
        super(QPgToast2396.class, metadata, "pg_toast", "pg_toast_2396");
    }

}

