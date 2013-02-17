package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11578 is a Querydsl query type for QPgToast11578
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11578 extends com.mysema.query.sql.RelationalPathBase<QPgToast11578> {

    private static final long serialVersionUID = -269011062;

    public static final QPgToast11578 pgToast11578 = new QPgToast11578("pg_toast_11578");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast11578> pgToast11578Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast11578(String variable) {
        super(QPgToast11578.class, forVariable(variable), "pg_toast", "pg_toast_11578");
    }

    @SuppressWarnings("all")
    public QPgToast11578(Path<? extends QPgToast11578> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11578");
    }

    public QPgToast11578(PathMetadata<?> metadata) {
        super(QPgToast11578.class, metadata, "pg_toast", "pg_toast_11578");
    }

}

