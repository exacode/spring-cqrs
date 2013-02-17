package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11558 is a Querydsl query type for QPgToast11558
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11558 extends com.mysema.query.sql.RelationalPathBase<QPgToast11558> {

    private static final long serialVersionUID = -269011124;

    public static final QPgToast11558 pgToast11558 = new QPgToast11558("pg_toast_11558");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast11558> pgToast11558Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast11558(String variable) {
        super(QPgToast11558.class, forVariable(variable), "pg_toast", "pg_toast_11558");
    }

    @SuppressWarnings("all")
    public QPgToast11558(Path<? extends QPgToast11558> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11558");
    }

    public QPgToast11558(PathMetadata<?> metadata) {
        super(QPgToast11558.class, metadata, "pg_toast", "pg_toast_11558");
    }

}

