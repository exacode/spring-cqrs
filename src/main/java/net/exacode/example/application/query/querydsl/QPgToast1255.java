package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast1255 is a Querydsl query type for QPgToast1255
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast1255 extends com.mysema.query.sql.RelationalPathBase<QPgToast1255> {

    private static final long serialVersionUID = -8676819;

    public static final QPgToast1255 pgToast1255 = new QPgToast1255("pg_toast_1255");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast1255> pgToast1255Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast1255(String variable) {
        super(QPgToast1255.class, forVariable(variable), "pg_toast", "pg_toast_1255");
    }

    @SuppressWarnings("all")
    public QPgToast1255(Path<? extends QPgToast1255> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_1255");
    }

    public QPgToast1255(PathMetadata<?> metadata) {
        super(QPgToast1255.class, metadata, "pg_toast", "pg_toast_1255");
    }

}

