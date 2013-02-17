package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast3596 is a Querydsl query type for QPgToast3596
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast3596 extends com.mysema.query.sql.RelationalPathBase<QPgToast3596> {

    private static final long serialVersionUID = -8614229;

    public static final QPgToast3596 pgToast3596 = new QPgToast3596("pg_toast_3596");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast3596> pgToast3596Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast3596(String variable) {
        super(QPgToast3596.class, forVariable(variable), "pg_toast", "pg_toast_3596");
    }

    @SuppressWarnings("all")
    public QPgToast3596(Path<? extends QPgToast3596> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_3596");
    }

    public QPgToast3596(PathMetadata<?> metadata) {
        super(QPgToast3596.class, metadata, "pg_toast", "pg_toast_3596");
    }

}

