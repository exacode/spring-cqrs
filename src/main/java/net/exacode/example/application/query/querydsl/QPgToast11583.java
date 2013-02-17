package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11583 is a Querydsl query type for QPgToast11583
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11583 extends com.mysema.query.sql.RelationalPathBase<QPgToast11583> {

    private static final long serialVersionUID = -269011036;

    public static final QPgToast11583 pgToast11583 = new QPgToast11583("pg_toast_11583");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast11583> pgToast11583Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast11583(String variable) {
        super(QPgToast11583.class, forVariable(variable), "pg_toast", "pg_toast_11583");
    }

    @SuppressWarnings("all")
    public QPgToast11583(Path<? extends QPgToast11583> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11583");
    }

    public QPgToast11583(PathMetadata<?> metadata) {
        super(QPgToast11583.class, metadata, "pg_toast", "pg_toast_11583");
    }

}

