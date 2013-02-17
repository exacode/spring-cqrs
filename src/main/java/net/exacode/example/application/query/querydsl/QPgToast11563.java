package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11563 is a Querydsl query type for QPgToast11563
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11563 extends com.mysema.query.sql.RelationalPathBase<QPgToast11563> {

    private static final long serialVersionUID = -269011098;

    public static final QPgToast11563 pgToast11563 = new QPgToast11563("pg_toast_11563");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast11563> pgToast11563Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast11563(String variable) {
        super(QPgToast11563.class, forVariable(variable), "pg_toast", "pg_toast_11563");
    }

    @SuppressWarnings("all")
    public QPgToast11563(Path<? extends QPgToast11563> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11563");
    }

    public QPgToast11563(PathMetadata<?> metadata) {
        super(QPgToast11563.class, metadata, "pg_toast", "pg_toast_11563");
    }

}

